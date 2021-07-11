package lesson3.task2;

  class Pupil {
    void study(){
    }
    void read(){
    }
    void write(){
    }
    void relax(){
    }
  }

  class ExcellentPupil extends Pupil{
    @Override
    void study() {
      System.out.println("ExcellentPupil: Study - Excellent");
    }

    @Override
    void read() {
      System.out.println("ExcellentPupil: Read - Excellent");
    }

    @Override
    void write() {
      System.out.println("ExcellentPupil: Write - Excellent");
    }

    @Override
    void relax() {
      System.out.println("ExcellentPupil: Relax - Excellent");
    }
  }
  class GoodPupil extends Pupil{
      @Override
      void study() {
        System.out.println("GoodPupil: Study - Good");
      }

      @Override
      void read() {
        System.out.println("GoodPupil: Read - Good");
      }

      @Override
      void write() {
        System.out.println("GoodPupil: Write - Good");
      }

      @Override
      void relax() {
        System.out.println("GoodPupil: Relax - Good");
      }
    }

    class BadPupil extends Pupil{
      @Override
      void study() {
        System.out.println("BadPupil: Study - Bad");
      }

      @Override
      void read() {
        System.out.println("BadPupil: Read - Bad");
      }

      @Override
      void write() {
        System.out.println("BadPupil: Write - Bad");
      }

      @Override
      void relax() {
        System.out.println("BadPupil: Relax - Bad");
      }
    }

