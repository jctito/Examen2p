
    public class Suma {
        //ATRIBUTOS

        int suma1,suma2;
        double suma1_1,suma2_2,suma3_3,total;

        public Suma() {

        }

        public double getTotal() {
            return total;
        }

        public void setTotal(double total) {
            this.total = total;
        }

        public int getSuma1() {
            return suma1;
        }

        public void setSument1(int suma1) {
            this.suma1 = suma1;
        }

        public int getSuma2() {
            return suma2;
        }

        public void setSuma2(int suma2) {
            this.suma2 = suma2;
        }

        public double getSuma1_1() {
            return suma1_1;
        }

        public void setSuma1_1(double suma1_1) {
            this.suma1_1 = suma1_1;
        }

        public double getSuma2_2() {
            return suma2_2;
        }

        public void setSuma2_2(double suma2_2) {
            this.suma2_2 = suma2_2;
        }

        public double getSuma3_3() {
            return suma3_3;
        }

        public void setSuma3_3(double suma3_3) {
            this.suma3_3 = suma3_3;
        }
        //  
        public Suma(int suma1, int suma2, double suma1_1, double suma2_2, double suma3_3,double total) {
            this.suma1 = suma1;
            this.suma2 = suma2;
            this.suma1_1 = suma1_1;
            this.suma2_2 = suma2_2;
            this.suma3_3 = suma3_3;
            this.total= total;
        }
// imprimir datos
        public void calcularSuma(int suma1,int suma2){
            total=suma1+suma2;
            System.out.println("La suma de los enteros es: "+ total);
        }
        public void calcularSuma(int suma1,int suma2,int suma3){
            total=suma1+suma2+suma3;
            System.out.println("La suma de los tres enteros es: "+ total);
        }
        public void calcularSuma(double suma1_1,double suma2_2){
            total=suma1_1+suma2_2;
            System.out.println("La suma de los dos valores es: "+total);
        }
        public void calcularSuma(double suma1_1,double suma2_2, double suma3_3){
            total=suma1_1+suma2_2+suma3_3;
            System.out.println("La suma de los tres valores es: "+total);



        }
    }


