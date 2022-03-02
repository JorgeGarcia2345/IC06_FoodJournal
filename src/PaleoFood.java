import java.io.Serializable;
import java.util.Objects;

public abstract class PaleoFood implements Serializable
{
    protected int mCalories;
    protected int mCarbs;
    protected String mName;

    public int getmCalories() {
        return mCalories;
    }

    public void setmCalories(int mCalories) {
        this.mCalories = mCalories;
    }

    public int getmCarbs() {
        return mCarbs;
    }

    public void setmCarbs(int mCarbs) {
        this.mCarbs = mCarbs;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaleoFood paleoFood = (PaleoFood) o;
        return mCalories == paleoFood.mCalories && mCarbs == paleoFood.mCarbs && Objects.equals(mName, paleoFood.mName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mCalories, mCarbs, mName);
    }

    public PaleoFood(int mCalories, int mCarbs, String mName)
    {
        this.mCalories = mCalories;
        this.mCarbs = mCarbs;
        this.mName = mName;
    }

}
