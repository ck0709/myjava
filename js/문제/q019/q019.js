const star="☆";
for( i = 1 ; i <= 10 ; i = i + 1 ) {
    for ( j = 10 ; j >= i ; j-- ) {
        if(j>(i-1)){
            document.write(star);
        }
    }
document.write("<br>")
}

