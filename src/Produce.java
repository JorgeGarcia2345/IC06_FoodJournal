import java.io.Serializable;
import java.util.Objects;

public class Produce extends PaleoFood implements Serializable
{
    private boolean mOrganic;
    
    public Produce(int mCalories, int mCarbs, String mName, boolean mOrganic)
    {
        super(mCalories, mCarbs, mName);
        this.mOrganic = mOrganic;
    }

    public boolean ismOrganic() {
        return mOrganic;
    }

    public void setmOrganic(boolean mOrganic) {
        this.mOrganic = mOrganic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Produce produce = (Produce) o;
        return mOrganic == produce.mOrganic;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mOrganic);
    }

    @Override
    public String toString()
    {

        return "Produce{" +
                "mCalories=" + mCalories +
                ", mCarbs=" + mCarbs +
                ", mName='" + mName + '\'' +
                ", mOrganic=" + mOrganic +
                '}';
    }

}
