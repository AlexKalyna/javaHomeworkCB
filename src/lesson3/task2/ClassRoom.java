package lesson3.task2;

public class ClassRoom {

    Pupil[] arrPupil;

    public ClassRoom(Pupil ExcellentPupil, Pupil GoodPupil, Pupil BadPupil)
    {
      arrPupil = new Pupil[] { ExcellentPupil, GoodPupil, BadPupil };
    }
    public ClassRoom(Pupil GoodPupil, Pupil BadPupil)
    {
      arrPupil = new Pupil[] { GoodPupil, BadPupil };
    }

    public  void PrintInfoStudy()
    {
      for (Pupil p: arrPupil)
      p.study();
    }
    public void PrintInfoRead()
    {
      for (Pupil p: arrPupil)
        p.read();
    }
    public void PrintInfoWrite()
    {
      for (Pupil p: arrPupil)
        p.write();
    }
    public void PrintInfoRelax()
    {
      for (Pupil p: arrPupil)
      p.relax();
    }
  }

    class  Main{
    public static void main(String[] args) {

      ClassRoom cRoom = new ClassRoom(new ExcellentPupil(), new GoodPupil(), new BadPupil());
      cRoom.PrintInfoStudy();
      cRoom.PrintInfoRead();
      cRoom.PrintInfoWrite();
      cRoom.PrintInfoRelax();

      System.out.println("------------------------------------------------------");

      ClassRoom c1Room = new ClassRoom(new GoodPupil(), new BadPupil());

      c1Room.PrintInfoStudy();
      c1Room.PrintInfoRead();
      c1Room.PrintInfoWrite();
      c1Room.PrintInfoRelax();




    }
  }
