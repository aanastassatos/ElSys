package ElSys;

import ElSys.Enums.CabinDirection;
import ElSys.Enums.CabinMode;

import java.util.HashSet;
import java.util.Set;

/**
 * Data object containing a {@link Cabin}s current state.
 */
public class CabinStatus
{
  private int currentFloor;
  private CabinDirection cabinDirection;
  private CabinMode cabinMode;
  private Set<FloorRequest> cabinRequests;
  private Integer destination;

  /**
   * Construct a representation of the cabins current state with the supplied elements.
   * @param currentFloor Floor cabin is at.
   * @param cabinDirection Direction cabin is traveling.
   * @param cabinMode Cabin's mode of operation.
   * @param cabinRequests Collection of the requests the cabin is currently processing.
   * @param destination Cabins current destination floor, null if there is none.
   */
  CabinStatus(final int currentFloor, final CabinDirection cabinDirection,
              final CabinMode cabinMode, Set<FloorRequest> cabinRequests,
              final Integer destination)
  {
    this.currentFloor = currentFloor;
    this.cabinDirection = cabinDirection;
    this.cabinMode = cabinMode;
    this.cabinRequests = cabinRequests;
    this.destination = destination;
  }

  /**
   * Return the state snapshot's floor.
   */
  public int getFloor()
  {
    return currentFloor;
  }

  public void setFloor(int floor){currentFloor = floor;}

  /**
   * Return the state snapshot's {@link CabinDirection}.
   */
  public CabinDirection getDirection()
  {
    return cabinDirection;
  }

  public void setDirection(CabinDirection dir){cabinDirection = dir;}

  /**
   * Return the state snapshot's {@link CabinMode}.
   */
  public CabinMode getMode()
  {
    return cabinMode;
  }

  public void setMode(CabinMode mode){cabinMode = mode;}

  /**
   * Return a set of the state snapshot's {@link FloorRequest}s.
   */
  public Set<FloorRequest> getCabinRequests(){ return cabinRequests;}

  public void setCabinRequests(Set<FloorRequest> requests)
  {
    if(!cabinRequests.equals(requests))
    {
      cabinRequests = new HashSet<>(requests);
    }
  }

  /**
   * Return the state snapshot's destination, or null if there is none.
   */
  public Integer getDestination()
  {
    return destination;
  }

  public void setDestination(Integer dest){destination = dest;}
}