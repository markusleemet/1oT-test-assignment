<template lang="pug">
  #long-forecast-component.custom-section
    b-container
      h2.section-heading.underlined-heading Long forecast
      .custom-section
        h3.section-heading
          font-awesome-icon(:icon="['fas', 'chart-area']")
          | Chart
        .custom-section
          h4 Day
          bar-chart(:data="{labels: labels, datasets: datasetsDay}" :options="barChartOptions")
        .custom-section
          h4 Night
          bar-chart(:data="{labels: labels, datasets: datasetsNight}" :options="barChartOptions")
      h3.section-heading
        font-awesome-icon.custom-icon.mr-2(:icon="['fas', 'temperature-low']")
        | General
      .day-forecast(v-for="forecast in weatherForecast.forecast")
        b-button(v-b-toggle="`${forecast.date}`")
          font-awesome-icon(:icon="['fas', 'calendar-day']")
          |  {{ forecast.date }}
        b-collapse(:id="forecast.date")
          b-row(align-h="center")
            b-col.custom-column(cols="12" sm="6" lg="4")
              day(:phenomenon="forecast.day.phenomenon" :temp-max="forecast.day.tempMax" :temp-min="forecast.day.tempMin" :description="forecast.day.text" :day="true")
            b-col.custom-column(cols="12" sm="6" lg="4")
              day(:phenomenon="forecast.night.phenomenon" :temp-max="forecast.night.tempMax" :temp-min="forecast.night.tempMin" :description="forecast.night.text" :day="false")
</template>

<script lang="js">
import BarChart from '../plugins/BarChart'
import Day from './Day'

export default {
  name: 'LongForecast',
  components: {
    BarChart,
    Day
  },
  props: {
    weatherForecast: {
      type: Object,
      default: () => {
      }
    }
  },
  data () {
    return {
      labels: [],
      datasetsDay: [
        {
          label: 'Max temperature',
          data: [],
          backgroundColor: 'rgba(255, 255, 255, 0)',
          borderColor: '#31ff7d',
          pointBackgroundColor: '#31ff7d',
          pointRadius: 7
        },
        {
          label: 'Min temperature',
          data: [],
          backgroundColor: 'rgba(255, 255, 255, 0)',
          borderColor: '#407a56',
          pointBackgroundColor: '#407a56',
          pointRadius: 7
        }
      ],
      datasetsNight: [
        {
          label: 'Max temperature',
          data: [],
          backgroundColor: 'rgba(255, 255, 255, 0)',
          borderColor: '#31ff7d',
          pointBackgroundColor: '#31ff7d',
          pointRadius: 7
        },
        {
          label: 'Min temperature',
          data: [],
          backgroundColor: 'rgba(255, 255, 255, 0)',
          borderColor: '#407a56',
          pointBackgroundColor: '#407a56',
          pointRadius: 7
        }
      ],
      barChartOptions: {
        responsive: true,
        maintainAspectRatio: false,
        legend: {
          display: true
        },
        title: {
          display: false
        },
        tooltips: {
          backgroundColor: '#407a56'
        },
        scales: {
          xAxes: [
            {
              gridLines: {
                display: false
              }
            }
          ],
          yAxes: [
            {
              ticks: {
                beginAtZero: true
              },
              gridLines: {
                display: false
              }
            }
          ]
        }
      }
    }
  },
  created () {
    this.getCartData()
  },
  methods: {
    getCartData () {
      for (const forecast of this.weatherForecast.forecast) {
        this.labels.push(forecast.date)
        this.datasetsDay[0].data.push(forecast.day.tempMax)
        this.datasetsDay[1].data.push(forecast.day.tempMin)
        this.datasetsNight[0].data.push(forecast.night.tempMax)
        this.datasetsNight[1].data.push(forecast.night.tempMin)
      }
    }
  }
}
</script>

<style lang="scss">
#long-forecast-component {
  .day-forecast {
    display: flex;
    flex-flow: column nowrap;
  }

  .btn {
    margin: 1rem;
    padding: 1rem;
    background-color: #407a56;
  }
  h4{
    text-align: center;
    text-transform: uppercase;
    font-weight: 700;
    margin-top: 1rem;
    margin-bottom: 2rem;
  }
}
</style>
