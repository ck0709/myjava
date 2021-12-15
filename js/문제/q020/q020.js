const star="☆";
//const star="*";
const space="　";
for( i = 1 ; i <= 10 ; i = i + 1 ) {
    for ( j = 1 ; j <= 10 ; j++ ) {
        if(j>(i-1)){
            document.write(star);
        }else {
            document.write(space);
        }
    }
document.write("<br>")
}

