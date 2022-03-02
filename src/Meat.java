import java.io.Serializable;
import java.util.Objects;

public class Meat extends PaleoFood implements Serializable
{
    private int mType;
    private String mCookingTemp;

    public Meat(int mCalories, String mName, int mType, String mCookingTemp) {
        super(mCalories, 0, mName);
        this.mType = mType;
        this.mCookingTemp = mCookingTemp;
    }

    public int getmType() {
        return mType;
    }

    public void setmType(int mType) {
        this.mType = mType;
    }

    public String getmCookingTemp() {
        return mCookingTemp;
    }

    public void setmCookingTemp(String mCookingTemp) {
        this.mCookingTemp = mCookingTemp;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Meat meat = (Meat) o;
        return mType == meat.mType && Objects.equals(mCookingTemp, meat.mCookingTemp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mType, mCookingTemp);
    }

    @Override
    public String toString() {

        String type = "";
        switch (mType)
        {
            case 1:
                type = "meat";
                break;
            case 2:
                type = "seafood";
                break;
        }
        return  type +
                ", mName='" + mName + '\'' +
                ", mCalories=" + mCalories +
                ", mCarbs=" + mCarbs +
                ", mCookingTemp='" + mCookingTemp + "F" +
                ']';
    }
}
