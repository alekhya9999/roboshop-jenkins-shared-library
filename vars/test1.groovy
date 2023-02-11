def new1() {
     print "hello"
     def xyz = 'hello'
    print "xyz = ${xyz}"
    print "abc = ${abc}"
}
//conditions

 if (abc=="somedata"){
     print "yes"
 } else{
     print "no"
 }

//loops in groovy: WHILE

def x=10
def y=0
   while (x>y){
       println"${y}"
     y++
   }

// for loop in groovy

for(int i=0;i<10;i++){
    println(i);
}

// for in loop
def fruits =["apple","mango","oranges"];
 for(i in fruits){
     println(i);
 }