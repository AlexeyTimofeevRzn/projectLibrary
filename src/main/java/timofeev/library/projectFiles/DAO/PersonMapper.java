package timofeev.library.projectFiles.DAO;

import org.springframework.jdbc.core.RowMapper;
import timofeev.library.projectFiles.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();

        person.setId(rs.getInt("person_id"));
        person.setFIO(rs.getString("name"));
        person.setYearOfBirth(rs.getInt("date_of_birth"));

        return person;
    }
}
