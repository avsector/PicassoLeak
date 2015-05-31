# PicassoLeak
Sample project to show there's a leak in Picasso library

The key to produce the problem is that PhotoActivity is finished before Picasso loads the image.
In order to achieve that, a large photo (1MB in size) is selected to be loaded.
You may need to test on slow connections or simply replace the photo URL with a larger photo 
to ensure the condition above.

The image in this sample is taken from http://www.stockvault.net/
