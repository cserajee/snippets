
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import java.lan.reflect.Type;

public class ModelMapperSnippet{

  public static void main(String[] args) {
      ModelMapper modelMapper = new ModelMapper();
      Employee employee = modelMapper.map(employeeDto, Employee.class);


      ModelMapper modelMapper = new ModelMapper();
      Type listType = new TypeToken<List<Employee>>() {}.getType();
      List<Employee> employees = modelMapper.map(employeeDtos, listType);
  }

}
