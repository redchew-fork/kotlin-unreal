/**
 * Created by hiperbou on 29/01/2017.
 */

fun init() :Function<Unit>{
    console.log("<<<INIT>>>")
    //return HelloKotlin()::cleanup
    return HelloBlueprint()::cleanup
}