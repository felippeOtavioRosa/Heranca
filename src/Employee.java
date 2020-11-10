/*
 (Hierarquia Employee) Na aula passada, estudamos uma hierarquia de herança em que a classe
 BasePlusCommissionEmployee é herdada da classe CommissionEmployee.
 Mas nem todos os tipos de empregados são CommissionEmployees. Neste exercício, você criará uma
 superclasse Employee mais geral para calcular os atributos e comportamentos na classe
 CommissionEmployee, que são comuns a todos os Employees. Os atributos e comportamentos
 comuns a todos os Employees são firstName, lastName, cpf, getFirstName, getLastName, getCpf
 e uma parte do método toString.
 Crie uma nova superclasse Employee que contenha esses métodos e variáveis de instância,
 além de um construtor. Então, reescreva a classe CommissionEmployee da aula passada como
 uma subclasse de Employee. A classe CommissionEmployee só deve conter os métodos e as variáveis
 de instância que não são declarados na superclasse Employee. O construtor da classe
 CommissionEmployee deve chamar o construtor da classe Employee, e o método toString de
 CommissionEmployee deve invocar o método toString de Employee.
 */

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String cpf;

    public Employee(String firstName, String lastName, String cpf) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s",
                "Funcionário", firstName, lastName,
                "CPF", cpf);
    }
}

