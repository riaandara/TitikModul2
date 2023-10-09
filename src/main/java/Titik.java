public class Titik {
    private int x,y;

    public Titik() {
    }

    public void inisialisasiTitik(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void tampilTtitik(){
        System.out.println("Titik(" + x + ", " + y + ")");
    }

        public void perkalianSkalar(int skalar){
        x *= skalar;
        y *= skalar;
            System.out.println(x);
            System.out.println(y);
        }
        public void pencerminanSumbuX(){
            y -= y;
            System.out.println(y);
        }
        public void pencerminanSumbuY(){
            x -= x;
            System.out.println(x);
        }

        public int jarak(Titik t2){
        int deltaX = this.x - t2.x;
        int deltaY = this.y - t2.y;
            return (int) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

}




