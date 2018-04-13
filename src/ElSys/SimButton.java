package ElSys;

import ElSys.Enums.ButtonLight;

/**
 * This class represents a simulated button in an elevator cabin.
 *
 * @author Antonio Griego
 */
public class SimButton
{
  private boolean isPressed;
  private ButtonLight buttonLight;
  private int floor;

  /**
   * Constructor method.
   *
   */
  public SimButton(int floor)
  {
    this.isPressed = false;
    this.buttonLight = ButtonLight.OFF;
    this.floor = floor;
  }

  /**
   * This method sets the status of the button light: true = on, false = off.
   * The status of the light is printed out to the console and the button
   * press status is updated: light on = button is pressed, light off = button
   * is not pressed.
   *
   * @param isButtonLightOn
   */
  public void setLight(boolean isButtonLightOn)
  {
    if(isButtonLightOn)
    {
      if(buttonLight != ButtonLight.ON)
      {
        System.out.println("Floor "+floor+": ButtonLight = ON");
      }
      this.buttonLight = ButtonLight.ON;
      isPressed = true;
    }
    
    else
    {
      System.out.println("Floor "+floor+": ButtonLight = OFF");
      this.buttonLight = ButtonLight.OFF;
      isPressed = false;
    }
  }

  /**
   * This method returns the pressed status of the button: true = pressed
   *
   * @return True = button is pressed; False = button is not pressed
   */
  public boolean isPressed()
  {
    return isPressed;
  }
}