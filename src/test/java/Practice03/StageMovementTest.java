package Practice03;

import myfirstproject.utilities.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StageMovementTest extends TestBase {
    @Test
    public void StageMovement() throws InterruptedException {

        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(3000);

        //aradigimiz bluz resmini inspect yaptiktik elementlerini aldik ,onu bulana kadar scroll down yapmasi talimatini yaptik
        WebElement image1 = driver.findElement(By.xpath("//img[@class='replace-2x img-responsive'][1]"));
        scrollIntoViewByJS(image1);
        Thread.sleep(3000);

       //bluzun uzerinde add to cart butonuna hover yapabilmek icin action class olusturduk
        Actions actions = new Actions(driver);
        actions.moveToElement(image1).perform();

        // add to cart butonuna click yapabilmek icin web element olusturduk
        WebElement addToCartButton= driver.findElement(By.xpath("(//span[.='Add to cart'])[1]"));
        addToCartButton.click();


        //Explicit wait yapiyor asagida==>
        //Add to cart a bastığımızda arada bir window çıkıyor  o window üzerinde birçok bilgi var quantity, color price vb.
        //o ekranın çıkmasını beklemek için o window daki başarılı eklediniz yazısının visible olmasını bekliyor yani aslında pencerenin görünür olmasını bekliyor
        //implicit olmaz çünkü bir elemanın görünmesini bekliyoruz, diğerinde sadece elemanın arama findElement beklemesi var
        //explicit de hem bulma hemde belirlil bir özelliğe sahip olmasını bekleyebiliyoruz

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //product successfully added your shopping cart
        WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2)[1]")));//Product successfully added to your shopping cart
        String productText = product.getText();
        Assert.assertEquals("Product successfully added to your shopping cart",productText);

        //And verifies the color ,size,quantity,price,shipping,total price

        //verifies the color,size==>orange,s
        WebElement colorAndSize= driver.findElement(By.id("layer_cart_product_attributes"));
        Assert.assertEquals("Orange, S",colorAndSize.getText());

        //verifies quantity==>1
        WebElement quantity= driver.findElement(By.id("layer_cart_product_quantity"));
        Assert.assertEquals("1",quantity.getText());

        //verifies price==>$16.51
        WebElement price= driver.findElement(By.id("layer_cart_product_price"));
        String expectedPrice=price.getText();
        Assert.assertEquals("$16.51",expectedPrice);

        //verifies shipping==>$2.00
        WebElement shipping= driver.findElement(By.xpath("//span[@class='ajax_cart_shipping_cost']"));
        Assert.assertEquals("$2.00",shipping.getText());

        //verifies total price==>$18.51
        WebElement totalPrice= driver.findElement(By.xpath("//span[@class='ajax_block_cart_total']"));
        Assert.assertEquals("$18.51",totalPrice.getText());

        //proceed to checkout butonuna click yapiyoruz
        driver.findElement(By.linkText("Proceed to checkout")).click();


        //verification shopping cart summary, verify=>shopping-cart summary is displayed
        WebElement cartSummary= driver.findElement(By.id("cart_title"));
        Assert.assertTrue(cartSummary.isDisplayed());

        //verify the product in stock
        WebElement inStock=driver.findElement(By.xpath("//span[@class='label label-success']"));
        Assert.assertEquals("In stock",inStock.getText());

        //Then verify the Unit price matches the price that is on the Add To Card page
        WebElement unitPrice= driver.findElement(By.xpath("//span[@id='product_price_1_1_0']"));
        String actualUnitPrice=unitPrice.getText();
        Assert.assertEquals(expectedPrice,actualUnitPrice);


        // user clicks on +(we are adding one more item)
        driver.findElement(By.xpath("//i[@class='icon-plus']")).click();

        Thread.sleep(3000);

         //verify the total price is 2*price+shipping=2 * 16.51 +2.00=35.02
        WebElement totalPrice2 = driver.findElement(By.xpath("//span[@id='total_price']"));
        Assert.assertEquals("$35.02",totalPrice2.getText());








    }

}
