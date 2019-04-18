class Point {
  float x;
  float y;
  // You can add additional member functions if you want.
}

class Rectangle {
  Point upper_left;
  Point lower_right;
Public float area(){
float width = lower_right.x-upper_left.x;
float height = upper_left.y-lower_right.y;
Return width * height;
}  
Public Point randomPoint(){
	float randX = Math.rand(upper_left.x, lower_right.x);
	float randY = Math.rand(lower_right.y, upper_left.y);
	Point sol = new Point(randX, randY);
	Return sol;
// You can add additional member functions if you want.
}

Point SamplePoint(Rectangle[] rectangles) {
	Float total = 0;
	for(int i = 0;i<rectangles.length;i++){
		Total += rectangles[i].area();
	}
	Float rand = Math.rand(0,total);
	for(int i =0;i<rectangles.length;i++){
		if(rand-rectangles[i].area() <=0){
			Return rectangles[i].randomPoint();
		}
		Rand = rand-rectangles[i].area();
	}
