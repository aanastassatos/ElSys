package ElSys;

import ElSys.Enums.CabinDirection;

public class FloorRequest
{
    private final int floor;
    private final CabinDirection cabinDirection;

    public FloorRequest(final int floor, final CabinDirection cabinDirection)
    {
        this.floor = floor;
        this.cabinDirection = cabinDirection;
    }

    public int getFloor()
    {
        return floor;
    }

    public CabinDirection getDirection()
    {
        return cabinDirection;
    }

    public void print()
    {
        System.out.println("Rquest for floor "+floor+" going "+cabinDirection);
    }
    
    @Override
    public int hashCode()
    {
        return cabinDirection != null ? floor ^ cabinDirection.hashCode() : floor;
    }

    @Override
    public boolean equals(final Object o)
    {
        return o instanceof FloorRequest && equals((FloorRequest) o);
    }

    private boolean equals(final FloorRequest o)
    {
        return getFloor() == o.getFloor() && getDirection() == o.getDirection();
    }

}
