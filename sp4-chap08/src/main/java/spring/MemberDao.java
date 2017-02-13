package spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class MemberDao {
	

	private JdbcTemplate jdbcTemplate;
	//데이터소스받아오기
	public MemberDao(DataSource dataSource){
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
	public Member selectByEmail(String email){
		//중복을 허용하는 리스트 컬렉션
		List<Member> results=jdbcTemplate.query(
				"select * from MEMBER where EMAIL=?",
				new RowMapper<Member>(){

					@Override
					public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
						// TODO Auto-generated method stub
						Member member = new Member(
								rs.getString("EMAIL"),
								rs.getString("PASSWORD"),
								rs.getString("NAME"),
								rs.getTimestamp("REGDATE"));
						member.setId(rs.getLong("ID"));
						return member;
					}
				},
				email);
		//java 컬렉션에서는 isEmpty메소드를 가지고 있음
		return results.isEmpty()?null:results.get(0);
	}
	public int count(){
		Integer count =jdbcTemplate.queryForObject("select count(*) from MEMBER",Integer.class);
		return count;
	}
	
	public void insert(final Member member){
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator(){

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// TODO Auto-generated method stub
				PreparedStatement pstmt = con.prepareStatement(
						"insert into MEMBER(EMAIL,PASSWORD,NAME,REGDATE) "+"values(?,?,?,?)", new String[] {"ID"});
				pstmt.setString(1, member.getEmail());
				pstmt.setString(2, member.getPassword());
				pstmt.setString(3, member.getName());
				pstmt.setTimestamp(4, new Timestamp(
						member.getRegisterDate().getTime()));
				return pstmt;
			}
					
			
		},keyHolder);
	}
	public void update(Member member){
		jdbcTemplate.update(
				"update MEMBER set NAME=?, PASSWORD=? where EMAIL=?", member.getName(),member.getPassword(),member.getEmail());
	}
	public List<Member> selectAll(){
		List<Member> results=jdbcTemplate.query("select * from MEMBER",
				new RowMapper<Member>(){

					@Override
					public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
						// TODO Auto-generated method stub
						Member member=new Member(
								rs.getString("EMAIL"),
								rs.getString("PASSWORD"),
								rs.getString("NAME"),
								rs.getTimestamp("REGDATE"));
						member.setId(rs.getLong("ID"));
						return member;
					}
		});
		return results;
	}
}
