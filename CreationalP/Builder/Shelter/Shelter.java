package CreationalP.Builder.Shelter;

public class Shelter {

  /**
   * The components of the shelter to be constructed
   */
  private String roof, structure, floor;

  /**
   * Constructing the roof component
   */
  public void setRoof(String newRoof){
    roof = newRoof;
  }
  /**
   * Constructing the structure component
   */
  public void setStructure(String newStructure){
    structure = newStructure;
  }
  /**
   * Constructing the floor component
   */
  public void setFloor(String newFloor){
    floor = newFloor;
  }
  public String toString(){
    return new String("roof= " + roof + "\nstructure= " + structure + "\nfloor= " + floor + "\n");
  }
    
}
