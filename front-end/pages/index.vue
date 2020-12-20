<template lang="pug">
  .index-page
    hero
    today-forecast(:todays-forecast="weatherData.forecast[0]")
    long-forecast(:weather-forecast="weatherData")
</template>

<script lang="js">
import Hero from '../components/Hero'
import Day from '../components/Day'
import LongForecast from '../components/LongForecast'
import TodayForecast from '../components/TodaysForecast'

export default {
  components: { TodayForecast, LongForecast, Day, Hero },
  async asyncData ({ $axios }) {
    const result = await $axios.$get(process.env.backendUrl + '/weather')
    return {
      weatherData: result
    }
  }
}
</script>

<style lang="scss">
body{
  background: #E3E2CE;
  color: #0a0a0a;
}
.index-page {
  .custom-section{
    margin-top: 4rem;
    margin-bottom: 4rem;
    .section-heading{
      text-align: center;
      text-transform: uppercase;
      margin-bottom: 3rem;
    }
    .underlined-heading{
      text-decoration: underline;
      text-decoration-style: solid;
      text-decoration-color: #407a56;
    }
    .custom-card{
      text-align: center;
      padding: 1rem;
      margin: 1rem;
      display: flex;
      flex-flow: column nowrap;
      border: 3px solid #407a56;;
      border-radius: 10px;
      .custom-icon{
        width: 50px;
        height: 50px;
        margin: 1rem auto;
      }
      .card-heading{
        text-align: center;
        text-transform: uppercase;
        font-weight: 700;
        margin-top: .5rem;
        margin-bottom: .5rem;
      }
    }
    span{
      font-weight: bold;
    }
    .custom-column{
      display: flex;
      align-items: stretch;
    }
    .btn{}
  }
}
</style>
