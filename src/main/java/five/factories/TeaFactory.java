package five.factories;

import five.domain.Ingredients;
import five.domain.Size;
import five.domain.Tea;

/**
 * Created by Rosie on 2016/04/03.
 */
public interface TeaFactory {
    Tea makeGreenTea(Size size, Ingredients ingredients);
    Tea makeRedTea(Size size, Ingredients ingredients);
    //Tea makeTeaLatte(Size size, Ingredients ingredients);

}
