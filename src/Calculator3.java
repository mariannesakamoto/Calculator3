 public class Calculator3 {
    public static void main(String[] args) {
        Calculator3 calculator = new Calculator3();

        // Total para cada pessoa
        int totalPerson1 = calculator.findTotal(10, 20, 30);
        int totalPerson2 = calculator.findTotal(15, 25, 35);

        System.out.println("Total para a pessoa 1: " + totalPerson1);
        System.out.println("Total para a pessoa 2: " + totalPerson2);

        // Modificar o método findTotal para aceitar um argumento 'name' String
        // e concatenar o nome ao imprimir o total
        int totalPerson1WithName = calculator.findTotalWithName("Pessoa 1", 10, 20, 30);
        int totalPerson2WithName = calculator.findTotalWithName("Pessoa 2", 15, 25, 35);
        
        System.out.println("Total para a pessoa 1: " + totalPerson1WithName);
        System.out.println("Total para a pessoa 2: " + totalPerson2WithName);
    }

    private int findTotal(int i, int i0, int i1) {
        return i + i0 + i1;
    }

    private int findTotalWithName(String name, int i, int i0, int i1) {
        int total = findTotal(i, i0, i1);
        System.out.print("Total para " + name + ": ");
        return total;
    }
}