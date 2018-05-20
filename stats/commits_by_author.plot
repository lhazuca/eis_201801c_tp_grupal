set terminal png transparent size 640,240
set size 1.0,1.0

set terminal png transparent size 640,480
set output 'commits_by_author.png'
set key left top
set yrange [0:]
set xdata time
set timefmt "%s"
set format x "%Y-%m-%d"
set grid y
set ylabel "Commits"
set xtics rotate
set bmargin 6
plot 'commits_by_author.dat' using 1:2 title "Luca Hazuca" w lines, 'commits_by_author.dat' using 1:3 title "unknown" w lines, 'commits_by_author.dat' using 1:4 title "lhazuca" w lines, 'commits_by_author.dat' using 1:5 title "diegosanchez" w lines, 'commits_by_author.dat' using 1:6 title "Tomás Hurrell" w lines, 'commits_by_author.dat' using 1:7 title "DiegoS" w lines, 'commits_by_author.dat' using 1:8 title "BrianLeoGoldman" w lines, 'commits_by_author.dat' using 1:9 title "Brian Goldman" w lines, 'commits_by_author.dat' using 1:10 title "Brian" w lines, 'commits_by_author.dat' using 1:11 title "henryborda97" w lines, 'commits_by_author.dat' using 1:12 title "Tomas Hurrell" w lines, 'commits_by_author.dat' using 1:13 title "Matias Pereira" w lines
