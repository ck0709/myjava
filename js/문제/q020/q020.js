const star="☆";
//const star="*";
const space="　";
for( i = 1 ; i <= 10 ; i = i + 1 ) {
    for ( j = 1 ; j <= 11 ; j++ ) {
        if(i>(j-1)){
            document.write(space);
        }else {
            document.write(star);
        }
    }
document.write("<br>")
}

