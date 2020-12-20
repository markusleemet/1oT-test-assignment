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
  background: #efefef;
  color: #0a0a0a;
}
.index-page {
  .custom-section{
    margin-top: 4rem;
    margin-bottom: 4rem;
    .section-heading{
      text-align: center;
      margin-bottom: 3rem;
    }
    .custom-card{
      text-align: center;
      padding: 1rem;
      margin: 1rem;
      display: flex;
      flex-flow: column nowrap;
      border: 2px solid black;
      border-radius: 10px;
      .custom-icon{
        width: 60px;
        height: 60px;
        margin-top: 1rem;
        margin-bottom: 1rem;
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
