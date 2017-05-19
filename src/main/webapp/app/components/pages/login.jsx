import React from 'react';
import auth from '../../auth';
import { withRouter  } from 'react-router';

import { t } from 'localizify';

import Bootstrap from 'bootstrap/dist/css/bootstrap.css';

const LoginPage = withRouter(
  React.createClass({

    getInitialState() {
      return {
        error: false,
        message: ''
      }
    },

    handleSubmit(event) {
      event.preventDefault()

      const username = this.refs.username.value
      const pass = this.refs.pass.value

      auth.login(username, pass, (loggedIn, message = t('Type wrong data')) => {
        if (!loggedIn)
          return this.setState({ error: true, message: t(message) })

        const { location } = this.props

        if (location.state && location.state.nextPathname) {
          this.props.router.replace(location.state.nextPathname)
        } else {
          this.props.router.replace('/')
        }
      })
    },

    render() {
      return (
        
        <div className="row">  
        <div className="col-md-offset-3 col-md-6">
        <div className="panel panel-primary">      
        <div className="panel-heading">Sign On</div>
        <div className="panel-body bg-warning">
        <form onSubmit={this.handleSubmit}>
          <label><input required="required" className="form-group" ref="username" placeholder="username" defaultValue="joe" /></label><br />
          <label><input required="required" type="password" ref="pass" placeholder="password" /></label><br />
          
          <br/>
          
          <button className="btn btn-primary" type="submit">{t('Login')}</button>
          {this.state.error && (
            <p>{this.state.message}</p>
          )}
        </form>
        </div>
        </div>
        </div>
        </div>
      )
    }
  })
)

export default LoginPage;