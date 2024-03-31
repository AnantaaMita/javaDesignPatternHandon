import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EDUserMain {
    public static void main(String args[]){
        List<EDUser> user=new ArrayList<>();
       user.add(new EDUser("ana","teacher"));
        user.add(new EDUser("ani","teacher"));
        user.add(new EDUser("dib","student"));
        user.add(new EDUser("onti","dancer"));
        EDUserMain ed=new EDUserMain();
        ed.getStudentTeacher(user);

    }
    public void getStudentTeacher(List<EDUser> user ){
        Map<String,String> smap=new HashMap<>();
        for(EDUser u:user){
            if (u.getRole().equals("teacher")||u.getRole().equals("student")){
                smap.put(u.getName(),u.getRole());
            }
        }
        System.out.println(smap);

    }
}
