public class BasePlusComissionEmployee extends ComissionEmployee{
    // outros atributos encontram-se na classe ComissionEmployee
    private double baseSalary;

    public BasePlusComissionEmployee(String firstName, String lastName, String cpf, double grossSales,
                                     double comissionRate, double baseSalary) {
        // chamando o construtor da superclasse (classe pai: ComissionEmployee)
        super(firstName, lastName, cpf, grossSales, comissionRate);
        setBaseSalary(baseSalary);// atributo que é específico da classe BasePlusComissionEmployee
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException(
                    "O Salário (baseSalary) deve ser >=0"
            );
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // calcula  o ganho semana do funcionário
    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s\n%s: R$ %.2f",
                "Salário Base e: ",super.toString(),
                "Salário Base: ",getBaseSalary());
    }

}

