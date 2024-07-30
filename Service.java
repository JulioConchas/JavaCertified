package JavaCertified;

/*
 * 07/30/2024 Julio Conchas Lab 11 Abstract Interfaces init creation
 */

public class Service implements Product
{
    private String name;
    private int estimatedTaskDuration;
    private boolean timeAndMaterials;

    // CONSTRUCTORS
    public Service( String name, int estimatedTaskDuration, boolean timeAndMaterials  )
    {
        this.name = name;
        this.estimatedTaskDuration = estimatedTaskDuration;
        this.timeAndMaterials = timeAndMaterials;
    }
    // GETTERS
    public String getName(){ return name; }
    public int getEstimatedTaskDuration(){ return estimatedTaskDuration; }
    public boolean isTimeAndMaterials(){ return timeAndMaterials; }
    // SETTERS
    public void setName(String name){ this.name = name; }
    public void setEstimatedTaskDuration(int estimatedTaskDuration){ this.estimatedTaskDuration = estimatedTaskDuration; }
    public void setTimeAndMaterials(boolean timeAndMaterials){ this.timeAndMaterials = timeAndMaterials; }
    // METHODS
    public String toString()
    {
        return name + " ( a " + estimatedTaskDuration + " day service )";
    }
}
