fun factorial(n: Int): Int {
    var ni = n;
    var value = 1;

    while(ni > 1){
        value *= ni--;
    }
    return value;
}

fun main(){
    var n = -1;
    while(n < 0){
        try {
            print("Please enter a positive number: ");
            n = readLine()!!.toInt();
        }
        catch(e: Exception){
            println("That's not a valid number\n");
            n = -1;
        }
    }

    print(factorial(n));

}