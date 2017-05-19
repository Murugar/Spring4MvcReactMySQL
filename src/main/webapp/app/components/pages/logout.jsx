import React from 'react';
import auth from '../../auth';
import { t } from 'localizify';

const LogoutPage = React.createClass({
  componentDidMount() {
    auth.logout()
  },

  render() {
    return (
         <div className="panel panel-primary">
         <div className="panel-heading">Sign Off</div>
            <div className="panel-body">        
      <p className="text-danger">{t('You Logged Out Succesfully')}</p>
      </div>
      </div>
    );
  }
});

export default LogoutPage;