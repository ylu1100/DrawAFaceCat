public class DrawAFaceRunner {

    public static void main(String[] args) {
        String[][] face = new String[7][8];
        FaceDrawing face1 = new FaceDrawing(face);// write your code here
        face1.fill("x");
        face1.edit(" ",0,2);
        face1.edit(" ",0,3);
        face1.edit(" ",0,4);
        face1.edit(" ",0,5);
        face1.edit(" ",0,1);
        face1.edit(" ",0,6);
        face1.edit(" ",1,3);
        face1.edit(" ",1,4);
        face1.edit("^",3,1);
        face1.edit("^",3,2);
        face1.edit("^",3,5);
        face1.edit("^",3,6);
        face1.edit("[",4,3);
        face1.edit("]",4,4);
        face1.edit(">",4,2);
        face1.edit("<",4,5);
        face1.edit("_",5,2);
        face1.edit("_",5,3);
        face1.edit("_",5,4);
        face1.edit("_",5,5);
        face1.edit("|",6,2);
        face1.edit("_",6,3);
        face1.edit("_",6,4);
        face1.edit("|",6,5);
        System.out.println(face1);
    }
}
