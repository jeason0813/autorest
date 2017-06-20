// Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Searchservice.Models
{
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using System.Runtime;
    using System.Runtime.Serialization;

    /// <summary>
    /// Defines values for SuggesterSearchMode.
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum SuggesterSearchMode
    {
        [EnumMember(Value = "analyzingInfixMatching")]
        AnalyzingInfixMatching
    }
    internal static class SuggesterSearchModeEnumExtension
    {
        internal static string ToSerializedValue(this SuggesterSearchMode? value )  =>
            value == null ? null : (( SuggesterSearchMode )value).ToSerializedValue();

        internal static string ToSerializedValue(this SuggesterSearchMode value )
        {
            switch( value )
            {
                case SuggesterSearchMode.AnalyzingInfixMatching:
                    return "analyzingInfixMatching";
            }
            return null;
        }

        internal static SuggesterSearchMode? ParseSuggesterSearchMode( this string value )
        {
            switch( value )
            {
                case "analyzingInfixMatching":
                    return SuggesterSearchMode.AnalyzingInfixMatching;            }
            return null;
        }
    }
}
