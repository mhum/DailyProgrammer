const scales = ['C', 'C#', 'D', 'D#', 'E', 'F', 'F#', 'G', 'G#', 'A', 'A#', 'B'];
const solfegeLookup = {
  Do: 0, Re: 2, Mi: 4, Fa: 5, So: 7, La: 9, Ti: 11,
};

/**
* Print the corrosponding note for the given scale and solfege
* @param {string} scale - Scale
* @param {solfege} solfege - Solfege
* @returns {void}
* */
const majorScale = (scale, solfege) => {
  console.log(scales[(solfegeLookup[solfege] + scales.indexOf(scale)) % scales.length]);
};

module.exports = majorScale;
