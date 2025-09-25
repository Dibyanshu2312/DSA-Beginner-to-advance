#include <iostream>
using namespace std;

// Define a structure (optional, for clarity)
struct Area {
    int sd;   // side of square
    int len;  // length of rectangle
    int wid;  // width of rectangle
};

// Function to compute areas
void find_area(int side, int len, int wid) {
    // computing area of square
    int area_square = side * side;
    cout << "Area of Square: " << area_square << endl;

    // computing area of rectangle
    int area_rectangle = len * wid;
    cout << "Area of Rectangle: " << area_rectangle << endl;
}

int main() {
    Area a;

    // Taking input
    cout << "Enter side of square: ";
    cin >> a.sd;

    cout << "Enter length and width of rectangle: ";
    cin >> a.len >> a.wid;

    // Call function
    find_area(a.sd, a.len, a.wid);

    return 0;
}
